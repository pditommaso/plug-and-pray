package foo;

import org.pf4j.Extension;
import plug.test.Greeting;

/**
 * @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 */
@Extension(ordinal = -1)
public class FooGreetings implements Greeting {

    @Override
    public String getGreeting() {
        return "This is FOO greeting";
    }
    
}
