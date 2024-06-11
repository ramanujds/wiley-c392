import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PlayGamesRoutingModule } from './play-games-routing.module';
import { PlayCricketComponent } from './play-cricket/play-cricket.component';


@NgModule({
  declarations: [
    PlayCricketComponent
  ],
  imports: [
    CommonModule,
    PlayGamesRoutingModule
  ]
})
export class PlayGamesModule { 

  constructor(){
    console.log('Play Games Module Loaded');
    
  }
}
