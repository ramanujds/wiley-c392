import { Directive, ElementRef, HostBinding, HostListener, Input, OnInit } from '@angular/core';

@Directive({
  selector: '[appMarkCompleted]'
})
export class MarkCompletedDirective{


  @Input('appMarkCompleted')
  status?:boolean;

  @HostBinding('style.backgroundColor')
  backgroundColor='white'


  @HostListener('mouseenter') 
  mouseOver(event:Event){
    this.backgroundColor=this.status?'green':'yellow';
  }

  @HostListener('mouseleave') 
  mouseOut(event:Event){
    this.backgroundColor='white';
  }

}
