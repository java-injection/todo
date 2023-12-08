package it.ji.annotations;

import it.ji.logic.PropertiesLogger;
import it.ji.properties.Configurations;

import java.lang.annotation.*;
import java.util.Date;

/**
 * This class represents a task that needs to be completed.
 *
 * <p>
 * The Todo annotation can be used to mark methods, constructors, fields, or classes as tasks that need to be implemented or completed.
 * It provides a title and description to provide additional information about the task.
 * </p>
 *
 * @since TODO version
 */
@Documented
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Todo {
    String title() default "";
    String description() default "";
    String dueDate() default "";
    Priority priority() default Priority.DEFAULT;
    TaskManager taskManager() default TaskManager.CLICKUP;

}
