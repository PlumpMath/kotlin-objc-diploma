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

package jet.objc;

@SuppressWarnings("UnusedDeclaration")
public abstract class ObjCObject {
    public static final ObjCObject NIL = Nil.INSTANCE;

    // This is long for efficiency, but probably needs to be Pointer<?>
    private final long pointer;

    protected ObjCObject(long pointer) {
        this.pointer = pointer;
    }

    @Override
    public String toString() {
        return String.format("[ObjCObject %s %016x]", getClass().getName(), pointer);
    }

    @Override
    public int hashCode() {
        return (int) (pointer ^ (pointer >>> 32));
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof ObjCObject && ((ObjCObject) o).pointer == pointer;
    }
}
