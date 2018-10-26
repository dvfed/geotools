/**
 *
 * $Id$
 */
package net.opengis.wfs20.validation;

import net.opengis.wfs20.StoredQueryDescriptionType;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link net.opengis.wfs20.CreateStoredQueryType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CreateStoredQueryTypeValidator {
  boolean validate();

  boolean validateStoredQueryDefinition(EList<StoredQueryDescriptionType> value);
}
