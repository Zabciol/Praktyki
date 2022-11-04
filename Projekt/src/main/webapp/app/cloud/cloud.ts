export interface ICloud {
    file : any;
}

export class cloud implements ICloud {
    constructor(public file : any){};
}