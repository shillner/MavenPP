package de.itemis.mpp.standalone;

import java.io.File;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;
import org.kohsuke.args4j.ParserProperties;

import com.google.inject.Injector;

import de.itemis.mpp.PomStandaloneSetup;

//TODO introduce an output file path which is optional (if path is not specified, the output file is generated besides the input file)
public class Main {
  @Option(name = "-in", aliases = {
      "--inputFile" }, required = true, metaVar = "PATH", usage = "The path of the input file (*.mpp) to be parsed")
  private File inputFile;

  @Option(name = "-h", aliases = { "--help" }, help = true, usage = "Disply help information")
  private boolean printHelp;

  public static void main(String[] args) {
    new Main().start(args);
  }

  private void start(String[] args) {
    ParserProperties parserProperties = ParserProperties.defaults();
    parserProperties.withUsageWidth(120);
    CmdLineParser parser = new CmdLineParser(this, parserProperties);
    try {
      parser.parseArgument(args);
    } catch (CmdLineException e) {
      printHelp(parser);
      return;
    }

    if (this.printHelp) {
      printHelp(parser);
      return;
    }

    Injector injector = new PomStandaloneSetup().createInjectorAndDoEMFRegistration();
    Generator generator = injector.getInstance(Generator.class);
    generator.generate(this.inputFile);
    System.out.println("Code generation finished.");
  }

  private void printHelp(CmdLineParser parser) {
    System.out.println("Maven++ usage: mpp [options]");
    System.out.println("\nOptions:");
    parser.printUsage(System.out);
  }
}
