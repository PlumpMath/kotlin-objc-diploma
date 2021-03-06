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

package org.jetbrains.jet.lang.resolve.scopes;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jet.lang.descriptors.*;
import org.jetbrains.jet.lang.resolve.name.LabelName;
import org.jetbrains.jet.lang.resolve.name.Name;

import java.util.Collection;
import java.util.List;

public interface JetScope {
    JetScope EMPTY = new JetScopeImpl() {
        @NotNull
        @Override
        public DeclarationDescriptor getContainingDeclaration() {
            throw new UnsupportedOperationException("Don't take containing declaration of the EMPTY scope");
        }

        @Override
        public String toString() {
            return "EMPTY";
        }
    };

    /**
     * Should not return object (class object or enum entry) class descriptors.
     */
    @Nullable
    ClassifierDescriptor getClassifier(@NotNull Name name);
    
    @Nullable
    ClassDescriptor getObjectDescriptor(@NotNull Name name);

    @NotNull
    Collection<ClassDescriptor> getObjectDescriptors();

    @Nullable
    NamespaceDescriptor getNamespace(@NotNull Name name);

    @NotNull
    Collection<VariableDescriptor> getProperties(@NotNull Name name);

    @Nullable
    VariableDescriptor getLocalVariable(@NotNull Name name);

    @NotNull
    Collection<FunctionDescriptor> getFunctions(@NotNull Name name);

    @NotNull
    DeclarationDescriptor getContainingDeclaration();

    @NotNull
    Collection<DeclarationDescriptor> getDeclarationsByLabel(@NotNull LabelName labelName);

    /**
     * @param fieldName includes the "$"
     * @return the property declaring this field, if any
     */
    @Nullable
    PropertyDescriptor getPropertyByFieldReference(@NotNull Name fieldName);

    /**
     * All visible descriptors from current scope.
     *
     * @return All visible descriptors from current scope.
     */
    @NotNull
    Collection<DeclarationDescriptor> getAllDescriptors();

    /**
     * Adds receivers to the list in order of locality, so that the closest (the most local) receiver goes first
     */
    @NotNull
    List<ReceiverParameterDescriptor> getImplicitReceiversHierarchy();

    @NotNull
    Collection<DeclarationDescriptor> getOwnDeclaredDescriptors();
}
