/**
 */
package de.itemis.mpp.pom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dependency Scope</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.itemis.mpp.pom.PomPackage#getDependencyScope()
 * @model
 * @generated
 */
public enum DependencyScope implements Enumerator
{
  /**
   * The '<em><b>COMPILE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMPILE_VALUE
   * @generated
   * @ordered
   */
  COMPILE(0, "COMPILE", "compile"),

  /**
   * The '<em><b>PROVIDED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROVIDED_VALUE
   * @generated
   * @ordered
   */
  PROVIDED(1, "PROVIDED", "provided"),

  /**
   * The '<em><b>RUNTIME</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RUNTIME_VALUE
   * @generated
   * @ordered
   */
  RUNTIME(2, "RUNTIME", "runtime"),

  /**
   * The '<em><b>SYSTEM</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SYSTEM_VALUE
   * @generated
   * @ordered
   */
  SYSTEM(3, "SYSTEM", "system"),

  /**
   * The '<em><b>TEST</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TEST_VALUE
   * @generated
   * @ordered
   */
  TEST(4, "TEST", "test"),

  /**
   * The '<em><b>IMPORT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IMPORT_VALUE
   * @generated
   * @ordered
   */
  IMPORT(5, "IMPORT", "import");

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
  public static final int COMPILE_VALUE = 0;

  /**
   * The '<em><b>PROVIDED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PROVIDED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PROVIDED
   * @model literal="provided"
   * @generated
   * @ordered
   */
  public static final int PROVIDED_VALUE = 1;

  /**
   * The '<em><b>RUNTIME</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RUNTIME</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RUNTIME
   * @model literal="runtime"
   * @generated
   * @ordered
   */
  public static final int RUNTIME_VALUE = 2;

  /**
   * The '<em><b>SYSTEM</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SYSTEM</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SYSTEM
   * @model literal="system"
   * @generated
   * @ordered
   */
  public static final int SYSTEM_VALUE = 3;

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
  public static final int TEST_VALUE = 4;

  /**
   * The '<em><b>IMPORT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>IMPORT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IMPORT
   * @model literal="import"
   * @generated
   * @ordered
   */
  public static final int IMPORT_VALUE = 5;

  /**
   * An array of all the '<em><b>Dependency Scope</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DependencyScope[] VALUES_ARRAY =
    new DependencyScope[]
    {
      COMPILE,
      PROVIDED,
      RUNTIME,
      SYSTEM,
      TEST,
      IMPORT,
    };

  /**
   * A public read-only list of all the '<em><b>Dependency Scope</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<DependencyScope> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Dependency Scope</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DependencyScope get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DependencyScope result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Dependency Scope</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DependencyScope getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DependencyScope result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Dependency Scope</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DependencyScope get(int value)
  {
    switch (value)
    {
      case COMPILE_VALUE: return COMPILE;
      case PROVIDED_VALUE: return PROVIDED;
      case RUNTIME_VALUE: return RUNTIME;
      case SYSTEM_VALUE: return SYSTEM;
      case TEST_VALUE: return TEST;
      case IMPORT_VALUE: return IMPORT;
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
  private DependencyScope(int value, String name, String literal)
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
  
} //DependencyScope
