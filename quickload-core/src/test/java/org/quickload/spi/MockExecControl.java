package org.quickload.spi;

import java.util.List;
import com.google.common.collect.ImmutableList;
import org.quickload.config.TaskSource;
import org.quickload.config.Report;

public class MockExecControl
        implements ExecControl
{
    private final List<Report> reports;
    private TaskSource taskSource;

    public MockExecControl()
    {
        this(ImmutableList.of(new Report()));
    }

    public MockExecControl(List<Report> reports)
    {
        this.reports = reports;
    }

    public List<Report> getReports()
    {
        return reports;
    }

    public TaskSource getTaskSource()
    {
        return taskSource;
    }

    public List<Report> run(TaskSource taskSource)
    {
        this.taskSource = taskSource;
        return reports;
    }
}