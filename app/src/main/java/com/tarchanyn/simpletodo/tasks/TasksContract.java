package com.tarchanyn.simpletodo.tasks;

import android.support.annotation.NonNull;

import com.tarchanyn.simpletodo.BasePresenter;
import com.tarchanyn.simpletodo.BaseView;
import com.tarchanyn.simpletodo.data.Task;

import java.util.List;

/**
 * Created by Java on 27.06.2016.
 */
public interface TasksContract {

    interface View extends BaseView<Presenter> {

        void showTasks(List<Task> tasks);

        void showAddTask();

        void showTaskDetailsUi(String taskId);

        void showLoadingTasksError();

        void showNoTasks();

        void showSuccessfullySavedMessage();

        boolean isActive();

    }

    interface Presenter extends BasePresenter {

        void result(int requestCode, int resultCode);

        void loadTasks(boolean forceUpdate);

        void addNewTask();

        void openTaskDetails(@NonNull Task requestedTask);

    }
}

