package com.k_int.utils.cql.criteria;

import org.hibernate.criterion.DetachedCriteria
import org.z3950.zing.cql.*
import groovy.util.logging.Log4j

/*
 * This Groovy source file was generated by the Gradle 'init' task.
 */
@Log4j
class CQLToCriteria {

  DetachedCriteria build(String query) {
    DetachedCriteria result = null;

    CQLNode cql_root = parseCQL(query);
    log.debug("Result of parse: ${cql_root.toCQL()}");

    return result;
  }

  CQLNode parseCQL(String cql) {
    CQLParser parser = new CQLParser();
    CQLNode root = parser.parse(cql);
    return root;
  }
}
