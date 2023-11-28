package it.ji.apt;

import com.google.auto.service.AutoService;
import it.ji.annotations.Todo;

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
        for (Element elem : roundEnv.getElementsAnnotatedWith(Todo.class)) {
            Todo todo = elem.getAnnotation(Todo.class);
            processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE,
                    "Method '" + elem.getSimpleName() + "' has a TODO: " + todo.description());
        }
        return true;
    }
}