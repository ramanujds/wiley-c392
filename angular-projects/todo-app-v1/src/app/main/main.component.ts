import { Component } from '@angular/core';
import { Todo } from '../../models/Todo';
import { TodoManagementService } from '../todo-management.service';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrl: './main.component.css'
})
export class MainComponent {

  constructor(public todoService:TodoManagementService){ }
  
 

}


