def add_task(task, task_list=[]):
    print(f"Adding task: {task}")
    task_list.append(task)
    return task_list

def simulate_workflow():
    print("--- Starting User 1 Workflow ---")
    user1_tasks = add_task("Draft email")
    add_task("Review reports", user1_tasks)
    print(f"User 1 Tasks: {user1_tasks}")

    print("\n--- Starting User 2 Workflow ---")
    user2_tasks = add_task("Schedule meeting")
    print(f"User 2 Tasks: {user2_tasks}")

    print("\n--- Starting User 3 Workflow ---")
    user3_tasks = add_task("Update website")
    print(f"User 3 Tasks: {user3_tasks}")

if __name__ == "__main__":
    simulate_workflow()


