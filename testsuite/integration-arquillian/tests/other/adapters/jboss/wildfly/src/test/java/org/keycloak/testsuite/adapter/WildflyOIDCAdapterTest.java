package org.keycloak.testsuite.adapter;

import org.keycloak.testsuite.adapter.servlet.AbstractDemoServletsAdapterTest;
import org.keycloak.testsuite.arquillian.annotation.AppServerContainer;

/**
 *
 * @author tkyjovsk
 */
@AppServerContainer("app-server-wildfly")
//@AdapterLibsLocationProperty("adapter.libs.wildfly")
public class WildflyOIDCAdapterTest extends AbstractDemoServletsAdapterTest {

}
