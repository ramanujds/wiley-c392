import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { MainComponent } from './main/main.component';
import { NavComponent } from './nav/nav.component';
import { TodoComponent } from './todo/todo.component';
import { TodoFormComponent } from './todo-form/todo-form.component';
import { MarkCompletedDirective } from './mark-completed.directive';
import { TodoFormReactiveComponent } from './todo-form-reactive/todo-form-reactive.component';
import { provideHttpClient, withInterceptorsFromDi } from '@angular/common/http';
import { TodoContainerComponent } from './todo-container/todo-container.component';
import { HomeComponentComponent } from './home-component/home-component.component';
import { ViewTodoComponent } from './view-todo/view-todo.component';
import { ErrorComponent } from './error/error.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    MainComponent,
    NavComponent,
    TodoComponent,
    TodoFormComponent,
    MarkCompletedDirective,
    TodoFormReactiveComponent,
    TodoContainerComponent,
    HomeComponentComponent,
    ViewTodoComponent,
    ErrorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,ReactiveFormsModule

],
  providers: [provideHttpClient(withInterceptorsFromDi())],
  bootstrap: [AppComponent]
})
export class AppModule { }
