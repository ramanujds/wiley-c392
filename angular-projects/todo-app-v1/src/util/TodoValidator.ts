import { AbstractControl, AsyncValidator, AsyncValidatorFn, ValidationErrors } from "@angular/forms";
import { Observable, map, switchMap, timer } from "rxjs";
import { TodoManagementService } from "../app/todo-management.service";

export function todoValidator(todoService: TodoManagementService): AsyncValidatorFn {

    return (control: AbstractControl) => {
        return  todoService.checkTodoByTitle(control.value.trim())
                    .pipe(map(result =>
                        result ? { 'duplicate-todo': {value:control.value} } : null
                    )
                    )
            
        
    }
}


