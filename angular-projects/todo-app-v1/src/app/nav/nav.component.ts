import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrl: './nav.component.css'
})
export class NavComponent implements OnInit {

  appTitle='Easy To-Do Manager'

  btnStatus=false


  ngOnInit(): void {
      setTimeout(()=>this.btnStatus=!this.btnStatus,5000)
  }

  showMessage(){
    alert("Hello")
  }


}
