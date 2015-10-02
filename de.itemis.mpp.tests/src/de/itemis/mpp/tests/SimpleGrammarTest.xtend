package de.itemis.mpp.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import de.itemis.mpp.PomInjectorProvider
import org.eclipse.xtext.junit4.util.ParseHelper
import javax.inject.Inject
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import de.itemis.mpp.pom.POM

@RunWith(XtextRunner)
@InjectWith(PomInjectorProvider)
class SimpleGrammarTest {

  @Inject extension ParseHelper<POM> parser
  @Inject extension ValidationTestHelper validator
 
 @Test
 def void test(){
   val model='''
   group x.y.z
   artifact a-b-c
   version 1.0.0-SNAPSHOT
   '''.parse
   model.assertNoIssues
 }
}