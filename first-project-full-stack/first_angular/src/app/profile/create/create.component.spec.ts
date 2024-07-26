import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateComponentProfile } from './create.component';

describe('CreateComponent', () => {
  let component: CreateComponentProfile;
  let fixture: ComponentFixture<CreateComponentProfile>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CreateComponentProfile]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CreateComponentProfile);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
