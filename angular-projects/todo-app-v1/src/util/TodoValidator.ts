import { AbstractControl, AsyncValidator, AsyncValidatorFn, ValidationErrors } from "@angular/forms";
import { Observable, map, switchMap, timer } from "rxjs";
import { TodoManagementService } from "../app/todo-management.service";
import { TodoApiService } from "../app/todo-api.service";

export function todoValidator(todoService: TodoApiService): AsyncValidatorFn {

    return (control: AbstractControl) => {
        return  todoService.fetchTodoByTitle(control.value.trim())
                    .pipe(map(result =>
                        result ? { 'duplicate-todo': {value:control.value} } : null
                    )
                    )
            
        
    }
}


