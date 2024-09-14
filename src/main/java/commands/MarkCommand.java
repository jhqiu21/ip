package commands;

import tasks.TaskList;

/**
 * Represents a command to mark a task as completed in the task list.
 * This class provides functionality to update the status of a specific task
 * to indicate that it has been completed, based on its index in the task list.
 */
public class MarkCommand {

    /**
     * Marks the complete status of a target task from task list.
     *
     * @param commandArray command user input.
     * @param allTasks task list.
     * @return A string confirming that the task has been marked as done.
     * @throws IllegalArgumentException If the index is out of bounds.
     */
    public static String run(String[] commandArray, TaskList allTasks)
            throws IndexOutOfBoundsException {
        int markIdx = Integer.parseInt(commandArray[1]) - 1;
        return allTasks.markTask(markIdx);
    }

    /** Sends help information of command 'mark' to user */
    public static String getHelpMessage() {
        return "Mark a task in the task list as done.\n\n"
                + "Format:\n"
                + "\t mark<whitespace>[index] \n"
                + "- [index] is the index of task you want to mark.\n\n"
                + "Remark: Please enter only one whitespace and correct index.";
    }
}
