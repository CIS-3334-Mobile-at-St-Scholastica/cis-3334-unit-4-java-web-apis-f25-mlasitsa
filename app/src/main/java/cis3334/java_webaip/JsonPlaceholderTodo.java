package cis3334.java_webaip;

/**
 * Model for https://jsonplaceholder.typicode.com/todos/1
 *
 * Example JSON:
 * {
 *   "userId": 1,
 *   "id": 1,
 *   "title": "delectus aut autem",
 *   "completed": false
 * }
 *
 * Keys and field names must match exactly (case-sensitive) for Moshi.
 */
public class JsonPlaceholderTodo {
    public int userId;
    public int id;
    public String title;
    public boolean completed;

    // Convenience getters for UI
    public String niceStatus() {
        return completed ? "completed ✅" : "not completed ❌";
    }

    @Override public String toString() {
        return "TODO #" + id + " (user " + userId + "): " + title + " — " + niceStatus();
    }
}
