/*
 * Copyright 2010-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.objc;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.objc.AbstractObjCWithJavaTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.GenerateTests}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/objc/java")
@InnerTestClasses({ObjCWithJavaTestGenerated.Arguments.class, ObjCWithJavaTestGenerated.Callbacks.class, ObjCWithJavaTestGenerated.Categories.class, ObjCWithJavaTestGenerated.Pointers.class, ObjCWithJavaTestGenerated.ReturnType.class})
public class ObjCWithJavaTestGenerated extends AbstractObjCWithJavaTest {
    public void testAllFilesPresentInJava() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/objc/java"), Pattern.compile("^(.+)\\.kt$"), true);
    }
    
    @TestMetadata("simpleClassObject.kt")
    public void testSimpleClassObject() throws Exception {
        doTest("compiler/testData/objc/java/simpleClassObject.kt");
    }
    
    @TestMetadata("compiler/testData/objc/java/arguments")
    public static class Arguments extends AbstractObjCWithJavaTest {
        public void testAllFilesPresentInArguments() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/objc/java/arguments"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("bool.kt")
        public void testBool() throws Exception {
            doTest("compiler/testData/objc/java/arguments/bool.kt");
        }
        
        @TestMetadata("char.kt")
        public void testChar() throws Exception {
            doTest("compiler/testData/objc/java/arguments/char.kt");
        }
        
        @TestMetadata("double.kt")
        public void testDouble() throws Exception {
            doTest("compiler/testData/objc/java/arguments/double.kt");
        }
        
        @TestMetadata("float.kt")
        public void testFloat() throws Exception {
            doTest("compiler/testData/objc/java/arguments/float.kt");
        }
        
        @TestMetadata("int.kt")
        public void testInt() throws Exception {
            doTest("compiler/testData/objc/java/arguments/int.kt");
        }
        
        @TestMetadata("long.kt")
        public void testLong() throws Exception {
            doTest("compiler/testData/objc/java/arguments/long.kt");
        }
        
        @TestMetadata("manyPrimitives.kt")
        public void testManyPrimitives() throws Exception {
            doTest("compiler/testData/objc/java/arguments/manyPrimitives.kt");
        }
        
        @TestMetadata("objcObject.kt")
        public void testObjcObject() throws Exception {
            doTest("compiler/testData/objc/java/arguments/objcObject.kt");
        }
        
        @TestMetadata("short.kt")
        public void testShort() throws Exception {
            doTest("compiler/testData/objc/java/arguments/short.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/objc/java/callbacks")
    public static class Callbacks extends AbstractObjCWithJavaTest {
        public void testAllFilesPresentInCallbacks() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/objc/java/callbacks"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            doTest("compiler/testData/objc/java/callbacks/simple.kt");
        }
        
        @TestMetadata("simpleWithClosure.kt")
        public void testSimpleWithClosure() throws Exception {
            doTest("compiler/testData/objc/java/callbacks/simpleWithClosure.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/objc/java/categories")
    public static class Categories extends AbstractObjCWithJavaTest {
        public void testAllFilesPresentInCategories() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/objc/java/categories"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("callCategoryMetaclassMethod.kt")
        public void testCallCategoryMetaclassMethod() throws Exception {
            doTest("compiler/testData/objc/java/categories/callCategoryMetaclassMethod.kt");
        }
        
        @TestMetadata("callCategoryMethod.kt")
        public void testCallCategoryMethod() throws Exception {
            doTest("compiler/testData/objc/java/categories/callCategoryMethod.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/objc/java/pointers")
    public static class Pointers extends AbstractObjCWithJavaTest {
        public void testAllFilesPresentInPointers() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/objc/java/pointers"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("argNSString.kt")
        public void testArgNSString() throws Exception {
            doTest("compiler/testData/objc/java/pointers/argNSString.kt");
        }
        
        @TestMetadata("argString.kt")
        public void testArgString() throws Exception {
            doTest("compiler/testData/objc/java/pointers/argString.kt");
        }
        
        @TestMetadata("pointerToChar.kt")
        public void testPointerToChar() throws Exception {
            doTest("compiler/testData/objc/java/pointers/pointerToChar.kt");
        }
        
        @TestMetadata("returnString.kt")
        public void testReturnString() throws Exception {
            doTest("compiler/testData/objc/java/pointers/returnString.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/objc/java/returnType")
    public static class ReturnType extends AbstractObjCWithJavaTest {
        public void testAllFilesPresentInReturnType() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/objc/java/returnType"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("bool.kt")
        public void testBool() throws Exception {
            doTest("compiler/testData/objc/java/returnType/bool.kt");
        }
        
        @TestMetadata("char.kt")
        public void testChar() throws Exception {
            doTest("compiler/testData/objc/java/returnType/char.kt");
        }
        
        @TestMetadata("double.kt")
        public void testDouble() throws Exception {
            doTest("compiler/testData/objc/java/returnType/double.kt");
        }
        
        @TestMetadata("float.kt")
        public void testFloat() throws Exception {
            doTest("compiler/testData/objc/java/returnType/float.kt");
        }
        
        @TestMetadata("int.kt")
        public void testInt() throws Exception {
            doTest("compiler/testData/objc/java/returnType/int.kt");
        }
        
        @TestMetadata("long.kt")
        public void testLong() throws Exception {
            doTest("compiler/testData/objc/java/returnType/long.kt");
        }
        
        @TestMetadata("nsstring.kt")
        public void testNsstring() throws Exception {
            doTest("compiler/testData/objc/java/returnType/nsstring.kt");
        }
        
        @TestMetadata("objcObject.kt")
        public void testObjcObject() throws Exception {
            doTest("compiler/testData/objc/java/returnType/objcObject.kt");
        }
        
        @TestMetadata("objcObjectIsCheck.kt")
        public void testObjcObjectIsCheck() throws Exception {
            doTest("compiler/testData/objc/java/returnType/objcObjectIsCheck.kt");
        }
        
        @TestMetadata("short.kt")
        public void testShort() throws Exception {
            doTest("compiler/testData/objc/java/returnType/short.kt");
        }
        
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("ObjCWithJavaTestGenerated");
        suite.addTestSuite(ObjCWithJavaTestGenerated.class);
        suite.addTestSuite(Arguments.class);
        suite.addTestSuite(Callbacks.class);
        suite.addTestSuite(Categories.class);
        suite.addTestSuite(Pointers.class);
        suite.addTestSuite(ReturnType.class);
        return suite;
    }
}
