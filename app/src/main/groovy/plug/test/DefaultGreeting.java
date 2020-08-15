package plug.test;

import org.pf4j.Extension;

/**
 *
 * @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 */
@Extension
public class DefaultGreeting implements Greeting {

    @Override
    public String getGreeting() {
        return "I'm the default greetings";
    }
}
