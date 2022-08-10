package com.example.myfirstproject.di.modules;

import com.example.myfirstproject.di.AppComponent;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

import org.jetbrains.annotations.NotNull;

public final class DaggerAppComponent implements AppComponent {

    public DaggerAppComponent(ContextModules contextModules) {

    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private ContextModules contextModules;

        private Builder() {
        }

        public Builder contextModule(ContextModules contextModules) {
            this.contextModules = Preconditions.checkNotNull(contextModules);
            return this;
        }

        public AppComponent build() {
            Preconditions.checkBuilderRequirement(contextModules, ContextModules.class);
            return new DaggerAppComponent(contextModules);
        }
    }

    }