package com.tarchanyn.simpletodo;

import android.content.Context;
import android.support.annotation.NonNull;

import com.tarchanyn.simpletodo.data.source.TasksRepository;
import com.tarchanyn.simpletodo.data.source.local.TasksLocalDataSource;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by Java on 27.06.2016.
 */
public class Injection {

    public static TasksRepository provideTasksRepository(@NonNull Context context) {
        checkNotNull(context);
        return TasksRepository.getInstance(TasksLocalDataSource.getInstance(context));
    }
}
