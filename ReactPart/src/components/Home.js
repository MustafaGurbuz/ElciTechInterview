import React, { Component } from 'react';
import axios from '../axios-users';
import User from '../components/User';
import Feedback from '../components/Feedback';

class Home extends Component {

    state = {
        user: []
    }

    componentDidMount() {
        axios.get('/users.json').then(res => {

            console.log(res.data)
            const array = []
            array.push(res.data);
            this.setState({ user: array })
            console.log(this.state.user)
        }).catch(error => {

        })
    }

    userSelectedHandler = (id) => {
        this.setState({ selectedPostId: id });
    }

    render() {
        let users = null;
        users = this.state.user.map(user => {
            return <User
                key={user.id}
                comment={user.comment}
                issue={user.issue}
                status={user.status}
                clicked={() => this.userSelectedHandler(user.id)}
            />;
        });

        return (
            <div>
                <h1 className="text-center">Home</h1>

                <section className="Posts">
                    {users}
                </section>
                <section>
                    <Feedback />
                </section>
            </div>
        );
    }
}

export default Home;