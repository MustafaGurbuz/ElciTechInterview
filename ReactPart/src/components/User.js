import React from 'react';

import './User.css';

const user = (props) => (
    <article className="User" onClick={props.clicked}>
        <h1>{props.issue}</h1>
        <div className="Info">
            <div className="Author">{props.comment}</div>
            <div className="Author">{props.status}</div>
        </div>
    </article>
);

export default user;