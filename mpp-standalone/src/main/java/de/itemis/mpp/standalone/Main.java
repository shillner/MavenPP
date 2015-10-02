package de.itemis.mpp.standalone;

import com.google.inject.Injector;

import de.itemis.mpp.PomStandaloneSetup;

public class Main {

  public static void main(String[] args) {
    Injector injector = new PomStandaloneSetup().createInjectorAndDoEMFRegistration();
    Generator generator = injector.getInstance(Generator.class);
    generator.generate(args[0]);
    System.out.println("Code generation finished.");
  }
}
