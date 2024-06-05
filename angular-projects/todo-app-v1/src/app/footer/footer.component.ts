import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrl: './footer.component.css'
})
export class FooterComponent implements OnInit {

  date:Date=new Date();

  ngOnInit(): void {
      setInterval(()=>this.date=new Date(),1000)
  }


}
