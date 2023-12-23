package it.ji.apt;

import com.google.auto.service.AutoService;
import it.ji.annotations.TaskManager;
import it.ji.annotations.Todo;
import it.ji.logic.PropertiesLogger;

import java.util.Set;
import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.*;
import javax.tools.Diagnostic;

@SupportedAnnotationTypes("it.ji.annotations.Todo")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@AutoService(Processor.class)
public class TodoProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        PropertiesLogger.getInstance().log("Processing annotations");
        System.out.println("WARNING: This is a dummy annotation processor, it does not do anything!");
        for (Element elem : roundEnv.getElementsAnnotatedWith(Todo.class)) {
            System.out.println("[INFO] Found a method with a TODO annotation!");
            Todo todo = elem.getAnnotation(Todo.class);
            processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE,
                    "Method '" + elem.getSimpleName() + "' has a TODO: " + todo.description());
            TaskManager taskManager = todo.taskManager();
            switch (taskManager) {
                case CLICKUP:
                    System.out.println("Task manager is CLICKUP");
                    break;
                case MONDAY:
                    System.out.println("Task manager is MONDAY");
                    break;
                case TRELLO:
                    System.out.println("Task manager is TRELLO");
                    break;
                default:
                    System.out.println("Task manager is not supported");
            }
        }
        return true;
    }

    private void clickUpProcessing(Todo todo) {
        System.out.println("Processing CLICKUP task");
    }
}