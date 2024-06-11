import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-play-cricket',
  templateUrl: './play-cricket.component.html',
  styleUrl: './play-cricket.component.css'
})
export class PlayCricketComponent implements OnInit {

  constructor(){
    console.log("Play Cricket Component Loaded")
  }


  ngOnInit(): void {
     
  }

}
