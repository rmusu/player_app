import { Injectable } from '@angular/core';
import { Observable } from'rxjs';
import { Player } from './Player';
import { HttpClient } from '@angular/common/http'



@Injectable({
    providedIn: 'root'
})

export class PlayerService{
    private apiServerUrl='';

    constructor(private http: HttpClient) { }

    public getPlayers() : Observable<Player[]>{

        return this.http.get<Player[]>('${this.apiServerUrl}/player/all')

    }

    public addPlayer(player:Player) : Observable<Player>{

        return this.http.post<Player>('${this.apiServerUrl}/add', player)

    }

    public updatePlayer(player:Player) : Observable<Player>{

        return this.http.put<Player>('${this.apiServerUrl}/update', player)

    }

    public deletePlayer(playerId:number) : Observable<void>{

        return this.http.delete<void>('${this.apiServerUrl}/delete/${playerId}')

    }
}
