package training.octaviusjr.timetracker.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import training.octaviusjr.timetracker.core.dao.TimeEntry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OctaviusJR on 10/31/2020.
 */
@Configuration
@ComponentScan("training.octaviusjr.timetracker.core")
public class TrackerCoreConfig {

    @Bean(name = "timesheet")
    public List<TimeEntry> timeEntries() {
        return new ArrayList<>();
    }
}
