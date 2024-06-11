import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PlayCricketComponent } from './play-cricket/play-cricket.component';

const routes: Routes = [{
  path:'',component:PlayCricketComponent
}];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PlayGamesRoutingModule { }
