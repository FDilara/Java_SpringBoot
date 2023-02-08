package com.javaspringboot.springBoot.componentScanAnnotation;

import com.javaspringboot.springBoot.componentScanAnnotation.branch.MakeComponent;
import com.javaspringboot.springBoot.componentScanAnnotation.branch.NewAnnotation;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class CustomFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //System.out.println(metadataReader.getClassMetadata().getClassName());

//        if(metadataReader.getClassMetadata().getClassName().contains("MyClass1")) {
//            return true;
//        }

        try {
            Class ref = Class.forName(metadataReader.getClassMetadata().getClassName());
//            if(ref.getSimpleName().contains("MyClass6")) {
//                return true;
//            }

//            if(ref.isAnnotationPresent(NewAnnotation.class)) {
//                return true;
//            }

//            if(ref.getSimpleName().contains("6")) {
//                return true;
//            }

            Class[] interfaces = ref.getInterfaces();
            for (Class anInterface : interfaces) {
                if(anInterface.getSimpleName().equals(MakeComponent.class.getSimpleName())) {
                    return true;
                }
            }


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        return false;
    }
}
