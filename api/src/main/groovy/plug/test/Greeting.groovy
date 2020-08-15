package plug.test

import groovy.transform.CompileStatic
import org.pf4j.ExtensionPoint

@CompileStatic
interface Greeting extends ExtensionPoint {

    String getGreeting();

}
