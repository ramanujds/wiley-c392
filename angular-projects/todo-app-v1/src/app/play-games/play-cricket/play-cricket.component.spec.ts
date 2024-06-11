import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PlayCricketComponent } from './play-cricket.component';

describe('PlayCricketComponent', () => {
  let component: PlayCricketComponent;
  let fixture: ComponentFixture<PlayCricketComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [PlayCricketComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(PlayCricketComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
