/**
 */
package de.itemis.mpp.pom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SCM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.SCM#getConnection <em>Connection</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.SCM#getDeveloperConncetion <em>Developer Conncetion</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.SCM#getUrl <em>Url</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.SCM#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @see de.itemis.mpp.pom.PomPackage#getSCM()
 * @model
 * @generated
 */
public interface SCM extends EObject
{
  /**
   * Returns the value of the '<em><b>Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connection</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connection</em>' attribute.
   * @see #setConnection(String)
   * @see de.itemis.mpp.pom.PomPackage#getSCM_Connection()
   * @model
   * @generated
   */
  String getConnection();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.SCM#getConnection <em>Connection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Connection</em>' attribute.
   * @see #getConnection()
   * @generated
   */
  void setConnection(String value);

  /**
   * Returns the value of the '<em><b>Developer Conncetion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Developer Conncetion</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Developer Conncetion</em>' attribute.
   * @see #setDeveloperConncetion(String)
   * @see de.itemis.mpp.pom.PomPackage#getSCM_DeveloperConncetion()
   * @model
   * @generated
   */
  String getDeveloperConncetion();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.SCM#getDeveloperConncetion <em>Developer Conncetion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Developer Conncetion</em>' attribute.
   * @see #getDeveloperConncetion()
   * @generated
   */
  void setDeveloperConncetion(String value);

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
   * @see de.itemis.mpp.pom.PomPackage#getSCM_Url()
   * @model
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.SCM#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

  /**
   * Returns the value of the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tag</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tag</em>' attribute.
   * @see #setTag(String)
   * @see de.itemis.mpp.pom.PomPackage#getSCM_Tag()
   * @model
   * @generated
   */
  String getTag();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.SCM#getTag <em>Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tag</em>' attribute.
   * @see #getTag()
   * @generated
   */
  void setTag(String value);

} // SCM
