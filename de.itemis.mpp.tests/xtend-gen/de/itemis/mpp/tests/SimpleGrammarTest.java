package de.itemis.mpp.tests;

import de.itemis.mpp.PomInjectorProvider;
import de.itemis.mpp.pom.POM;
import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(PomInjectorProvider.class)
@SuppressWarnings("all")
public class SimpleGrammarTest {
  @Inject
  @Extension
  private ParseHelper<POM> parser;
  
  @Inject
  @Extension
  private ValidationTestHelper validator;
  
  @Test
  public void test() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("group x.y.z");
      _builder.newLine();
      _builder.append("artifact a-b-c");
      _builder.newLine();
      _builder.append("version 1.0.0-SNAPSHOT");
      _builder.newLine();
      final POM model = this.parser.parse(_builder);
      this.validator.assertNoIssues(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
