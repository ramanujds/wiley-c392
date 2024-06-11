import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'statusText'
})
export class StatusTextPipe implements PipeTransform {

  transform(value: any, ...args: unknown[]): string {
    return value?'Done':'Pending'
  }

}
