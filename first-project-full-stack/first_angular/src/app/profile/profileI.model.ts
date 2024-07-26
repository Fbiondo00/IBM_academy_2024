import { Observable } from "rxjs";
import { Profile } from "./model/profile.model";
import { InjectionToken } from "@angular/core";

export const profile_service_token = new InjectionToken<ProfileServiceI>('profile_service_token');

export interface ProfileServiceI {
	getProfile(): Observable<any>;
	getProfilebyCode(code: string): Observable<any> ;
	saveProfile(profile:Profile): Observable<any>;
	removeProfile(code: string): Observable<any>;
}
