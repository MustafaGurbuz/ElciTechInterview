import React, { Component } from 'react';
import axios from '../axios-users';
import './Feedback.css';

class Feedback extends Component {

    state = {
        issue: '',
        comment: '',
        status: 1,
        id: '111'
    }

    userPostData = () => {
        const arrayId = []
        arrayId.push(new Date())
        const data = {
            issue: this.state.issue,
            comment: this.state.comment,
            status: this.state.status,
            id: arrayId.slice(0, 1)
        };

        axios.post('/save.json', data).then(res => {
            console.log(res)

        })
    }

    render() {

        return (
            <div className="Feedback">
                <h1>Add a New Topic</h1>
                <label>Issue</label>
                <input type="text" value={this.state.title} onChange={(event) => this.setState({ issue: event.target.value })} />
                <label>comment</label>
                <textarea rows="4" value={this.state.content} onChange={(event) => this.setState({ comment: event.target.value })} />

                <button onClick={this.userPostData}>Add Comment</button>
            </div>
        );
    }
}

export default Feedback;