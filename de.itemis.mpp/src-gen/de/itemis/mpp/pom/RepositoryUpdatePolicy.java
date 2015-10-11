/**
 */
package de.itemis.mpp.pom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Repository Update Policy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.itemis.mpp.pom.PomPackage#getRepositoryUpdatePolicy()
 * @model
 * @generated
 */
public enum RepositoryUpdatePolicy implements Enumerator
{
  /**
   * The '<em><b>DAILY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DAILY_VALUE
   * @generated
   * @ordered
   */
  DAILY(0, "DAILY", "daily"),

  /**
   * The '<em><b>ALWAYS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALWAYS_VALUE
   * @generated
   * @ordered
   */
  ALWAYS(1, "ALWAYS", "always"),

  /**
   * The '<em><b>NEVER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NEVER_VALUE
   * @generated
   * @ordered
   */
  NEVER(2, "NEVER", "never"),

  /**
   * The '<em><b>INTERVAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTERVAL_VALUE
   * @generated
   * @ordered
   */
  INTERVAL(3, "INTERVAL", "interval");

  /**
   * The '<em><b>DAILY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DAILY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DAILY
   * @model literal="daily"
   * @generated
   * @ordered
   */
  public static final int DAILY_VALUE = 0;

  /**
   * The '<em><b>ALWAYS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ALWAYS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALWAYS
   * @model literal="always"
   * @generated
   * @ordered
   */
  public static final int ALWAYS_VALUE = 1;

  /**
   * The '<em><b>NEVER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NEVER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NEVER
   * @model literal="never"
   * @generated
   * @ordered
   */
  public static final int NEVER_VALUE = 2;

  /**
   * The '<em><b>INTERVAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INTERVAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INTERVAL
   * @model literal="interval"
   * @generated
   * @ordered
   */
  public static final int INTERVAL_VALUE = 3;

  /**
   * An array of all the '<em><b>Repository Update Policy</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final RepositoryUpdatePolicy[] VALUES_ARRAY =
    new RepositoryUpdatePolicy[]
    {
      DAILY,
      ALWAYS,
      NEVER,
      INTERVAL,
    };

  /**
   * A public read-only list of all the '<em><b>Repository Update Policy</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<RepositoryUpdatePolicy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Repository Update Policy</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static RepositoryUpdatePolicy get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RepositoryUpdatePolicy result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Repository Update Policy</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static RepositoryUpdatePolicy getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RepositoryUpdatePolicy result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Repository Update Policy</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static RepositoryUpdatePolicy get(int value)
  {
    switch (value)
    {
      case DAILY_VALUE: return DAILY;
      case ALWAYS_VALUE: return ALWAYS;
      case NEVER_VALUE: return NEVER;
      case INTERVAL_VALUE: return INTERVAL;
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
  private RepositoryUpdatePolicy(int value, String name, String literal)
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
  
} //RepositoryUpdatePolicy
