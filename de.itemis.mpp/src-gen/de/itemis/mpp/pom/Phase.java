/**
 */
package de.itemis.mpp.pom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Phase</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.itemis.mpp.pom.PomPackage#getPhase()
 * @model
 * @generated
 */
public enum Phase implements Enumerator
{
  /**
   * The '<em><b>DEFAULT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEFAULT_VALUE
   * @generated
   * @ordered
   */
  DEFAULT(0, "DEFAULT", "default"),

  /**
   * The '<em><b>PRE CLEAN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PRE_CLEAN_VALUE
   * @generated
   * @ordered
   */
  PRE_CLEAN(1, "PRE_CLEAN", "pre-clean"),

  /**
   * The '<em><b>CLEAN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CLEAN_VALUE
   * @generated
   * @ordered
   */
  CLEAN(2, "CLEAN", "clean"),

  /**
   * The '<em><b>POST CLEAN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #POST_CLEAN_VALUE
   * @generated
   * @ordered
   */
  POST_CLEAN(3, "POST_CLEAN", "post-clean"),

  /**
   * The '<em><b>VALIDATE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VALIDATE_VALUE
   * @generated
   * @ordered
   */
  VALIDATE(4, "VALIDATE", "validate"),

  /**
   * The '<em><b>INITIALIZE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INITIALIZE_VALUE
   * @generated
   * @ordered
   */
  INITIALIZE(5, "INITIALIZE", "initialize"),

  /**
   * The '<em><b>GENERATE SOURCES</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GENERATE_SOURCES_VALUE
   * @generated
   * @ordered
   */
  GENERATE_SOURCES(6, "GENERATE_SOURCES", "generate-sources"),

  /**
   * The '<em><b>PROCESS SOURCES</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROCESS_SOURCES_VALUE
   * @generated
   * @ordered
   */
  PROCESS_SOURCES(7, "PROCESS_SOURCES", "process-sources"),

  /**
   * The '<em><b>GENERATE RESOURCES</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GENERATE_RESOURCES_VALUE
   * @generated
   * @ordered
   */
  GENERATE_RESOURCES(8, "GENERATE_RESOURCES", "generate-resources"),

  /**
   * The '<em><b>PROCESS RESOURCES</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROCESS_RESOURCES_VALUE
   * @generated
   * @ordered
   */
  PROCESS_RESOURCES(9, "PROCESS_RESOURCES", "process-resources"),

  /**
   * The '<em><b>COMPILE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMPILE_VALUE
   * @generated
   * @ordered
   */
  COMPILE(10, "COMPILE", "compile"),

  /**
   * The '<em><b>PROCESS CLASSES</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROCESS_CLASSES_VALUE
   * @generated
   * @ordered
   */
  PROCESS_CLASSES(11, "PROCESS_CLASSES", "process-classes"),

  /**
   * The '<em><b>GENERATE TEST SOURCES</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GENERATE_TEST_SOURCES_VALUE
   * @generated
   * @ordered
   */
  GENERATE_TEST_SOURCES(12, "GENERATE_TEST_SOURCES", "generate-test-sources"),

  /**
   * The '<em><b>PROCESS TEST SOURCES</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROCESS_TEST_SOURCES_VALUE
   * @generated
   * @ordered
   */
  PROCESS_TEST_SOURCES(13, "PROCESS_TEST_SOURCES", "process-test-sources"),

  /**
   * The '<em><b>GENERATE TEST RESOURCES</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GENERATE_TEST_RESOURCES_VALUE
   * @generated
   * @ordered
   */
  GENERATE_TEST_RESOURCES(14, "GENERATE_TEST_RESOURCES", "generate-test-resources"),

  /**
   * The '<em><b>PROCESS TEST RESOURCES</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROCESS_TEST_RESOURCES_VALUE
   * @generated
   * @ordered
   */
  PROCESS_TEST_RESOURCES(15, "PROCESS_TEST_RESOURCES", "process-test-resources"),

  /**
   * The '<em><b>TEST COMPILE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TEST_COMPILE_VALUE
   * @generated
   * @ordered
   */
  TEST_COMPILE(16, "TEST_COMPILE", "test-compile"),

  /**
   * The '<em><b>PROCESS TEST CLASSES</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROCESS_TEST_CLASSES_VALUE
   * @generated
   * @ordered
   */
  PROCESS_TEST_CLASSES(17, "PROCESS_TEST_CLASSES", "process-test-classes"),

  /**
   * The '<em><b>TEST</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TEST_VALUE
   * @generated
   * @ordered
   */
  TEST(18, "TEST", "test"),

  /**
   * The '<em><b>PREPARE PACKAGE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PREPARE_PACKAGE_VALUE
   * @generated
   * @ordered
   */
  PREPARE_PACKAGE(19, "PREPARE_PACKAGE", "prepare-package"),

  /**
   * The '<em><b>PACKAGE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PACKAGE_VALUE
   * @generated
   * @ordered
   */
  PACKAGE(20, "PACKAGE", "package"),

  /**
   * The '<em><b>PRE INTEGRATION TEST</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PRE_INTEGRATION_TEST_VALUE
   * @generated
   * @ordered
   */
  PRE_INTEGRATION_TEST(21, "PRE_INTEGRATION_TEST", "pre-integration-test"),

  /**
   * The '<em><b>INTEGRATION TEST</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTEGRATION_TEST_VALUE
   * @generated
   * @ordered
   */
  INTEGRATION_TEST(22, "INTEGRATION_TEST", "integration-test"),

  /**
   * The '<em><b>POST INTEGRATION TEST</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #POST_INTEGRATION_TEST_VALUE
   * @generated
   * @ordered
   */
  POST_INTEGRATION_TEST(23, "POST_INTEGRATION_TEST", "post-integration-test"),

  /**
   * The '<em><b>VERIFY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VERIFY_VALUE
   * @generated
   * @ordered
   */
  VERIFY(24, "VERIFY", "verify"),

  /**
   * The '<em><b>INSTALL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INSTALL_VALUE
   * @generated
   * @ordered
   */
  INSTALL(25, "INSTALL", "install"),

  /**
   * The '<em><b>DEPLOY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEPLOY_VALUE
   * @generated
   * @ordered
   */
  DEPLOY(26, "DEPLOY", "deploy"),

  /**
   * The '<em><b>PRE SITE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PRE_SITE_VALUE
   * @generated
   * @ordered
   */
  PRE_SITE(27, "PRE_SITE", "pre-site"),

  /**
   * The '<em><b>SITE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SITE_VALUE
   * @generated
   * @ordered
   */
  SITE(28, "SITE", "site"),

  /**
   * The '<em><b>POST SITE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #POST_SITE_VALUE
   * @generated
   * @ordered
   */
  POST_SITE(29, "POST_SITE", "post-site"),

  /**
   * The '<em><b>SITE DEPLOY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SITE_DEPLOY_VALUE
   * @generated
   * @ordered
   */
  SITE_DEPLOY(30, "SITE_DEPLOY", "site-deploy");

  /**
   * The '<em><b>DEFAULT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DEFAULT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DEFAULT
   * @model literal="default"
   * @generated
   * @ordered
   */
  public static final int DEFAULT_VALUE = 0;

  /**
   * The '<em><b>PRE CLEAN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PRE CLEAN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PRE_CLEAN
   * @model literal="pre-clean"
   * @generated
   * @ordered
   */
  public static final int PRE_CLEAN_VALUE = 1;

  /**
   * The '<em><b>CLEAN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CLEAN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CLEAN
   * @model literal="clean"
   * @generated
   * @ordered
   */
  public static final int CLEAN_VALUE = 2;

  /**
   * The '<em><b>POST CLEAN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>POST CLEAN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #POST_CLEAN
   * @model literal="post-clean"
   * @generated
   * @ordered
   */
  public static final int POST_CLEAN_VALUE = 3;

  /**
   * The '<em><b>VALIDATE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VALIDATE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VALIDATE
   * @model literal="validate"
   * @generated
   * @ordered
   */
  public static final int VALIDATE_VALUE = 4;

  /**
   * The '<em><b>INITIALIZE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INITIALIZE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INITIALIZE
   * @model literal="initialize"
   * @generated
   * @ordered
   */
  public static final int INITIALIZE_VALUE = 5;

  /**
   * The '<em><b>GENERATE SOURCES</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>GENERATE SOURCES</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GENERATE_SOURCES
   * @model literal="generate-sources"
   * @generated
   * @ordered
   */
  public static final int GENERATE_SOURCES_VALUE = 6;

  /**
   * The '<em><b>PROCESS SOURCES</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PROCESS SOURCES</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PROCESS_SOURCES
   * @model literal="process-sources"
   * @generated
   * @ordered
   */
  public static final int PROCESS_SOURCES_VALUE = 7;

  /**
   * The '<em><b>GENERATE RESOURCES</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>GENERATE RESOURCES</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GENERATE_RESOURCES
   * @model literal="generate-resources"
   * @generated
   * @ordered
   */
  public static final int GENERATE_RESOURCES_VALUE = 8;

  /**
   * The '<em><b>PROCESS RESOURCES</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PROCESS RESOURCES</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PROCESS_RESOURCES
   * @model literal="process-resources"
   * @generated
   * @ordered
   */
  public static final int PROCESS_RESOURCES_VALUE = 9;

  /**
   * The '<em><b>COMPILE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>COMPILE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COMPILE
   * @model literal="compile"
   * @generated
   * @ordered
   */
  public static final int COMPILE_VALUE = 10;

  /**
   * The '<em><b>PROCESS CLASSES</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PROCESS CLASSES</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PROCESS_CLASSES
   * @model literal="process-classes"
   * @generated
   * @ordered
   */
  public static final int PROCESS_CLASSES_VALUE = 11;

  /**
   * The '<em><b>GENERATE TEST SOURCES</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>GENERATE TEST SOURCES</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GENERATE_TEST_SOURCES
   * @model literal="generate-test-sources"
   * @generated
   * @ordered
   */
  public static final int GENERATE_TEST_SOURCES_VALUE = 12;

  /**
   * The '<em><b>PROCESS TEST SOURCES</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PROCESS TEST SOURCES</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PROCESS_TEST_SOURCES
   * @model literal="process-test-sources"
   * @generated
   * @ordered
   */
  public static final int PROCESS_TEST_SOURCES_VALUE = 13;

  /**
   * The '<em><b>GENERATE TEST RESOURCES</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>GENERATE TEST RESOURCES</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GENERATE_TEST_RESOURCES
   * @model literal="generate-test-resources"
   * @generated
   * @ordered
   */
  public static final int GENERATE_TEST_RESOURCES_VALUE = 14;

  /**
   * The '<em><b>PROCESS TEST RESOURCES</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PROCESS TEST RESOURCES</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PROCESS_TEST_RESOURCES
   * @model literal="process-test-resources"
   * @generated
   * @ordered
   */
  public static final int PROCESS_TEST_RESOURCES_VALUE = 15;

  /**
   * The '<em><b>TEST COMPILE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TEST COMPILE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TEST_COMPILE
   * @model literal="test-compile"
   * @generated
   * @ordered
   */
  public static final int TEST_COMPILE_VALUE = 16;

  /**
   * The '<em><b>PROCESS TEST CLASSES</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PROCESS TEST CLASSES</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PROCESS_TEST_CLASSES
   * @model literal="process-test-classes"
   * @generated
   * @ordered
   */
  public static final int PROCESS_TEST_CLASSES_VALUE = 17;

  /**
   * The '<em><b>TEST</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TEST</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TEST
   * @model literal="test"
   * @generated
   * @ordered
   */
  public static final int TEST_VALUE = 18;

  /**
   * The '<em><b>PREPARE PACKAGE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PREPARE PACKAGE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PREPARE_PACKAGE
   * @model literal="prepare-package"
   * @generated
   * @ordered
   */
  public static final int PREPARE_PACKAGE_VALUE = 19;

  /**
   * The '<em><b>PACKAGE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PACKAGE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PACKAGE
   * @model literal="package"
   * @generated
   * @ordered
   */
  public static final int PACKAGE_VALUE = 20;

  /**
   * The '<em><b>PRE INTEGRATION TEST</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PRE INTEGRATION TEST</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PRE_INTEGRATION_TEST
   * @model literal="pre-integration-test"
   * @generated
   * @ordered
   */
  public static final int PRE_INTEGRATION_TEST_VALUE = 21;

  /**
   * The '<em><b>INTEGRATION TEST</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INTEGRATION TEST</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INTEGRATION_TEST
   * @model literal="integration-test"
   * @generated
   * @ordered
   */
  public static final int INTEGRATION_TEST_VALUE = 22;

  /**
   * The '<em><b>POST INTEGRATION TEST</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>POST INTEGRATION TEST</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #POST_INTEGRATION_TEST
   * @model literal="post-integration-test"
   * @generated
   * @ordered
   */
  public static final int POST_INTEGRATION_TEST_VALUE = 23;

  /**
   * The '<em><b>VERIFY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VERIFY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VERIFY
   * @model literal="verify"
   * @generated
   * @ordered
   */
  public static final int VERIFY_VALUE = 24;

  /**
   * The '<em><b>INSTALL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INSTALL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INSTALL
   * @model literal="install"
   * @generated
   * @ordered
   */
  public static final int INSTALL_VALUE = 25;

  /**
   * The '<em><b>DEPLOY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DEPLOY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DEPLOY
   * @model literal="deploy"
   * @generated
   * @ordered
   */
  public static final int DEPLOY_VALUE = 26;

  /**
   * The '<em><b>PRE SITE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PRE SITE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PRE_SITE
   * @model literal="pre-site"
   * @generated
   * @ordered
   */
  public static final int PRE_SITE_VALUE = 27;

  /**
   * The '<em><b>SITE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SITE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SITE
   * @model literal="site"
   * @generated
   * @ordered
   */
  public static final int SITE_VALUE = 28;

  /**
   * The '<em><b>POST SITE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>POST SITE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #POST_SITE
   * @model literal="post-site"
   * @generated
   * @ordered
   */
  public static final int POST_SITE_VALUE = 29;

  /**
   * The '<em><b>SITE DEPLOY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SITE DEPLOY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SITE_DEPLOY
   * @model literal="site-deploy"
   * @generated
   * @ordered
   */
  public static final int SITE_DEPLOY_VALUE = 30;

  /**
   * An array of all the '<em><b>Phase</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Phase[] VALUES_ARRAY =
    new Phase[]
    {
      DEFAULT,
      PRE_CLEAN,
      CLEAN,
      POST_CLEAN,
      VALIDATE,
      INITIALIZE,
      GENERATE_SOURCES,
      PROCESS_SOURCES,
      GENERATE_RESOURCES,
      PROCESS_RESOURCES,
      COMPILE,
      PROCESS_CLASSES,
      GENERATE_TEST_SOURCES,
      PROCESS_TEST_SOURCES,
      GENERATE_TEST_RESOURCES,
      PROCESS_TEST_RESOURCES,
      TEST_COMPILE,
      PROCESS_TEST_CLASSES,
      TEST,
      PREPARE_PACKAGE,
      PACKAGE,
      PRE_INTEGRATION_TEST,
      INTEGRATION_TEST,
      POST_INTEGRATION_TEST,
      VERIFY,
      INSTALL,
      DEPLOY,
      PRE_SITE,
      SITE,
      POST_SITE,
      SITE_DEPLOY,
    };

  /**
   * A public read-only list of all the '<em><b>Phase</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Phase> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Phase</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Phase get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Phase result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Phase</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Phase getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Phase result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Phase</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Phase get(int value)
  {
    switch (value)
    {
      case DEFAULT_VALUE: return DEFAULT;
      case PRE_CLEAN_VALUE: return PRE_CLEAN;
      case CLEAN_VALUE: return CLEAN;
      case POST_CLEAN_VALUE: return POST_CLEAN;
      case VALIDATE_VALUE: return VALIDATE;
      case INITIALIZE_VALUE: return INITIALIZE;
      case GENERATE_SOURCES_VALUE: return GENERATE_SOURCES;
      case PROCESS_SOURCES_VALUE: return PROCESS_SOURCES;
      case GENERATE_RESOURCES_VALUE: return GENERATE_RESOURCES;
      case PROCESS_RESOURCES_VALUE: return PROCESS_RESOURCES;
      case COMPILE_VALUE: return COMPILE;
      case PROCESS_CLASSES_VALUE: return PROCESS_CLASSES;
      case GENERATE_TEST_SOURCES_VALUE: return GENERATE_TEST_SOURCES;
      case PROCESS_TEST_SOURCES_VALUE: return PROCESS_TEST_SOURCES;
      case GENERATE_TEST_RESOURCES_VALUE: return GENERATE_TEST_RESOURCES;
      case PROCESS_TEST_RESOURCES_VALUE: return PROCESS_TEST_RESOURCES;
      case TEST_COMPILE_VALUE: return TEST_COMPILE;
      case PROCESS_TEST_CLASSES_VALUE: return PROCESS_TEST_CLASSES;
      case TEST_VALUE: return TEST;
      case PREPARE_PACKAGE_VALUE: return PREPARE_PACKAGE;
      case PACKAGE_VALUE: return PACKAGE;
      case PRE_INTEGRATION_TEST_VALUE: return PRE_INTEGRATION_TEST;
      case INTEGRATION_TEST_VALUE: return INTEGRATION_TEST;
      case POST_INTEGRATION_TEST_VALUE: return POST_INTEGRATION_TEST;
      case VERIFY_VALUE: return VERIFY;
      case INSTALL_VALUE: return INSTALL;
      case DEPLOY_VALUE: return DEPLOY;
      case PRE_SITE_VALUE: return PRE_SITE;
      case SITE_VALUE: return SITE;
      case POST_SITE_VALUE: return POST_SITE;
      case SITE_DEPLOY_VALUE: return SITE_DEPLOY;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Phase(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Phase
