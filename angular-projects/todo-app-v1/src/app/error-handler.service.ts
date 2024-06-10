import { Injectable } from '@angular/core';
import { ErrorResponse } from '../models/ErrorResponse';

@Injectable({
  providedIn: 'root'
})
export class ErrorHandlerService {

  public errorDetails?:ErrorResponse;

  constructor() { }
}
