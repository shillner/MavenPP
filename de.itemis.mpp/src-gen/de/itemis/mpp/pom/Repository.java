/**
 */
package de.itemis.mpp.pom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.Repository#isPluginRepositroy <em>Plugin Repositroy</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.Repository#getId <em>Id</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.Repository#getUrl <em>Url</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.Repository#getName <em>Name</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.Repository#getLayout <em>Layout</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.Repository#getPolicies <em>Policies</em>}</li>
 * </ul>
 *
 * @see de.itemis.mpp.pom.PomPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends EObject
{
  /**
   * Returns the value of the '<em><b>Plugin Repositroy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plugin Repositroy</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plugin Repositroy</em>' attribute.
   * @see #setPluginRepositroy(boolean)
   * @see de.itemis.mpp.pom.PomPackage#getRepository_PluginRepositroy()
   * @model
   * @generated
   */
  boolean isPluginRepositroy();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.Repository#isPluginRepositroy <em>Plugin Repositroy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Plugin Repositroy</em>' attribute.
   * @see #isPluginRepositroy()
   * @generated
   */
  void setPluginRepositroy(boolean value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see de.itemis.mpp.pom.PomPackage#getRepository_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.Repository#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(String)
   * @see de.itemis.mpp.pom.PomPackage#getRepository_Url()
   * @model
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.Repository#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.itemis.mpp.pom.PomPackage#getRepository_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.Repository#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Layout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layout</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layout</em>' attribute.
   * @see #setLayout(String)
   * @see de.itemis.mpp.pom.PomPackage#getRepository_Layout()
   * @model
   * @generated
   */
  String getLayout();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.Repository#getLayout <em>Layout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layout</em>' attribute.
   * @see #getLayout()
   * @generated
   */
  void setLayout(String value);

  /**
   * Returns the value of the '<em><b>Policies</b></em>' containment reference list.
   * The list contents are of type {@link de.itemis.mpp.pom.RepositoryPolicy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Policies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Policies</em>' containment reference list.
   * @see de.itemis.mpp.pom.PomPackage#getRepository_Policies()
   * @model containment="true"
   * @generated
   */
  EList<RepositoryPolicy> getPolicies();

} // Repository
