import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TodoFormReactiveComponent } from './todo-form-reactive.component';

describe('TodoFormReactiveComponent', () => {
  let component: TodoFormReactiveComponent;
  let fixture: ComponentFixture<TodoFormReactiveComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [TodoFormReactiveComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(TodoFormReactiveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
