

## Project Documentation

This documentation provides an overview of the "Notification-Tasker" Java application.

## Table of Contents

1. [Introduction](#introduction)
2. [Getting Started](#getting-started)
   - [Prerequisites](#prerequisites)
   - [Installation](#installation)
3. [Usage](#usage)
4. [Features](#features)
7. [Code Documentation](#code-documentation)
   - [Task Class](#task-class)
   - [INotification Interface](#inotification-interface)

## Introduction <a name="introduction"></a>

The "Notification-Tasker" is a Java application that allows users to manage tasks with notifications.

## Getting Started <a name="getting-started"></a>


## Usage <a name="usage"></a>

To use the "Notification-Tasker" application:

1. Launch the application.
2. Add tasks with descriptions.
3. Manage tasks by toggling their status or deleting them.
4. Receive notifications for task updates.

## Features <a name="features"></a>

- Add tasks with descriptions.
- Toggle the status of tasks (e.g., from "Ne-finalizat" to "Finalizat").
- Delete tasks.
- Receive notifications for task updates.


## Code Documentation <a name="code-documentation"></a>

### Task Class <a name="task-class"></a>

The `Task` class represents a task in the application. It implements the `INotification` interface and provides the following methods and attributes:

- `Task(String descriere)`: Constructor to create a task with a description.
- `finalization()`: Method to finalize a task and send a notification.
- `toggleStatus()`: Method to toggle the status of a task.
- `getDescriere()`: Method to get the task description.
- `getStatus()`: Method to get the task status.
- `getNotifications()`: Method to get task notifications.
- `trimiteNotificare(String mesaj)`: Method to send notifications.
- `toString()`: Method to provide a formatted string representation of the task.

### INotification Interface <a name="inotification-interface"></a>

The `INotification` interface defines the `trimiteNotificare(String mesaj)` method for sending notifications.

For more detailed information about the code, please refer to the source code files in this repository.





# Swing-based Task Management Application

This documentation provides an overview of a Swing-based Java application for managing tasks with graphical user interface (GUI).

## Table of Contents

1. [Introduction](#introduction)
2. [Application Overview](#application-overview)
3. [User Interface Elements](#user-interface-elements)
   - [Main Window](#main-window)
   - [Task List](#task-list)
   - [Task Description Input](#task-description-input)
   - [Add Task Button](#add-task-button)
   - [Status Toggle Button](#status-toggle-button)
   - [Delete Task Button](#delete-task-button)
4. [Application Logic](#application-logic)
5. [Usage](#usage)

## Introduction <a name="introduction"></a>

This documentation explains a Java application that allows users to manage tasks with a graphical user interface. It uses Swing and AWT for GUI components.

## Application Overview <a name="application-overview"></a>

The application creates a main window (`JFrame`) with several user interface elements, including a task list, task description input field, "Add Task" button, "Toggle Status" button, and "Delete Task" button. Users can add tasks, toggle their status, and delete tasks.

## User Interface Elements <a name="user-interface-elements"></a>

### Main Window <a name="main-window"></a>

- The main window is a `JFrame` with the title "Notification-Tasker."
- It has a size of 400x500 pixels.
- The default close operation is set to exit the application when the frame is closed.

### Task List <a name="task-list"></a>

- The task list is displayed in a `JList<Task>` with a scroll pane (`JScrollPane`) for handling a large number of tasks.
- It uses a `DefaultListModel` to manage the tasks.

### Task Description Input <a name="task-description-input"></a>

- Users can input task descriptions using a `JTextField` named `descriereTask`.
- The background color of the input field is set to cyan.

### Add Task Button <a name="add-task-button"></a>

- The "Add Task" button (`JButton`) allows users to add a new task to the list.
- It has a green background and white text for customization.

### Status Toggle Button <a name="status-toggle-button"></a>

- The "Toggle Status" button is a `JButton` used to toggle the status of a selected task.
- It appears when a task is selected.
- It has a gray background and blue text for customization.

### Delete Task Button <a name="delete-task-button"></a>

- The "Delete Task" button is a `JButton` used to delete a selected task.
- It appears when a task is selected.
- Users are prompted for confirmation before deletion.
- It has a red background and white text for customization.

## Application Logic <a name="application-logic"></a>

- The application allows users to add tasks with descriptions.
- Users can toggle the status of a selected task.
- Users can delete a selected task with confirmation.

## Usage <a name="usage"></a>

To use the application:

1. Launch the application.
2. Input task descriptions in the provided field.
3. Click the "Add Task" button to add a task.
4. Select a task in the list to enable the "Toggle Status" and "Delete Task" buttons.
5. Use the "Toggle Status" button to change the task status.
6. Use the "Delete Task" button to delete a selected task with confirmation.


