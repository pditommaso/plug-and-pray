package foo;

import org.pf4j.Extension;
import plug.test.Greeting;

/**
 * Simple Extension example
 * 
 * NOTE: both plugins and extensions must be Java (not groovy) classes
 *
 * @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 */
@Extension(ordinal = -1)
public class FooGreetings implements Greeting {

    @Override
    public String getGreeting() {
        return "This is FOO greeting";
    }
    
}
