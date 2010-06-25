package net.sf.serfj.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Annotation used to mark a resource method that responds to HTTP DELETE
 * requests.
 * 
 * @author eduardo.yanez
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface DELETE {
}