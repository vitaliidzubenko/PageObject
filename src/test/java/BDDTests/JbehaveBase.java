package BDDTests;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.jbehave.core.steps.Steps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JbehaveBase extends JUnitStories {

    @Override
    public Configuration configuration() {
        return new MostUsefulConfiguration()
                .useStoryLoader(new LoadFromClasspath(this.getClass().getClassLoader()))
                .useStoryReporterBuilder(
                        new StoryReporterBuilder()
                                .withDefaultFormats()
                                .withFormats(Format.HTML, Format.CONSOLE)
                                .withRelativeDirectory("jbehave-report"));

    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        ArrayList<Steps> stepFileList = new ArrayList<Steps>();
        //stepFileList.add(a);

        return new InstanceStepsFactory(configuration(), stepFileList);
    }

    @Override
    protected List<String> storyPaths() {
        return new StoryFinder()
                .findPaths(CodeLocations.codeLocationFromClass(this.getClass()),
                        Arrays.asList("ria.story"),
                        Arrays.asList("ria.story"));


    }

}
