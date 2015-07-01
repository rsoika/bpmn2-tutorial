/**
 */
package bpmn2.tutorial.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn2.tutorial.model.DocumentRoot#getItem <em>Item</em>}</li>
 *   <li>{@link bpmn2.tutorial.model.DocumentRoot#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see bpmn2.tutorial.model.ModelPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(Item)
	 * @see bpmn2.tutorial.model.ModelPackage#getDocumentRoot_Item()
	 * @model containment="true" upper="-2"
	 *        extendedMetaData="name='item' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	Item getItem();

	/**
	 * Sets the value of the '{@link bpmn2.tutorial.model.DocumentRoot#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(Item value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see bpmn2.tutorial.model.ModelPackage#getDocumentRoot_Value()
	 * @model containment="true" upper="-2"
	 *        extendedMetaData="name='value' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link bpmn2.tutorial.model.DocumentRoot#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

} // DocumentRoot
